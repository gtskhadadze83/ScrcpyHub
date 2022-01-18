package model.command

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import model.command.creator.AdbCommandCreator

class AdbCommandCreatorTest : StringSpec(
    {
        "create" {
            val factory = AdbCommandCreator(path = "test/")
            factory.create() shouldBe listOf("test/adb")

            val factoryWhenNoSeparator = AdbCommandCreator(path = "test")
            factoryWhenNoSeparator.create() shouldBe listOf("test/adb")
        }
        "create_when_no_path_specified" {
            val factory = AdbCommandCreator()
            factory.create() shouldBe listOf("adb")
        }
        "create_help" {
            val factory = AdbCommandCreator(path = "test/")
            factory.createHelp() shouldBe listOf("test/adb", "--help")

            val factoryWhenNoSeparator = AdbCommandCreator(path = "test")
            factoryWhenNoSeparator.createHelp() shouldBe listOf("test/adb", "--help")
        }
        "create_help_when_no_path_specified" {
            val factory = AdbCommandCreator()
            factory.createHelp() shouldBe listOf("adb", "--help")
        }
    }
)