/*
 * Copyright (C) 2013-2016, The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cyanogenmod.hardware;

import org.cyanogenmod.internal.util.FileUtils;

/*
 * Disable capacitive keys
 *
 * This is intended for use on devices in which the capacitive keys
 * can be fully disabled for replacement with a soft navbar. You
 * really should not be using this on a device with mechanical or
 * otherwise visible-when-inactive keys
 */

public class KeyDisabler {

    private static final String KEYDISABLER_PATH = "/sys/class/sec/sec_touchkey/keypad_enable";
    /*
     * All HAF classes should export this boolean.
     * Real implementations must, of course, return true
     */

    public static boolean isSupported() {
        return FileUtils.isFileWritable(KEYDISABLER_PATH);
    }

    /*
     * Are the keys currently blocked?
     */

    public static boolean isActive() {
        return FileUtils.readOneLine(KEYDISABLER_PATH).equals("0");
    }

    /*
     * Disable capacitive keys
     */

    public static boolean setActive(boolean state) {
        return FileUtils.writeLine(KEYDISABLER_PATH, state ? "0" : "1");
    }
}
