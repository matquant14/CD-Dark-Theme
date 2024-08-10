package com.github.matquant14.cddarktheme.codestyle;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;


public class RsCodeStyleSettings extends CustomCodeStyleSettings {
    public Boolean ALIGN_TYPE_PARAMS = true;
    public Boolean PRESERVE_PUNCTUATION = true;
    public Boolean SPACE_AROUND_ASSOC_TYPE_BINDING = true;


    public RsCodeStyleSettings(CodeStyleSettings settings) {
        super("RsCodeStyleSettings", settings);
    }
}
