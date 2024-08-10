package com.github.matquant14.cddarktheme.codestyle;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;


public class XML extends CustomCodeStyleSettings {
    public Boolean XML_SPACE_AROUND_EQUALITY_IN_ATTRIBUTE = true;


    public XML(CodeStyleSettings settings) {
        super("XML", settings);
    }
}
