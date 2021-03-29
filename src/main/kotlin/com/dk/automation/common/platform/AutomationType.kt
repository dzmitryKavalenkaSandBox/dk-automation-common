package com.dk.automation.common.platform

internal enum class AutomationType(val automationType: String) {
    WEB("selenide"),
    UIAUTOMATOR2("uiautomator2"),
    ESPRESSO("espresso"),
    XCUITEST("XCUITest")
}
