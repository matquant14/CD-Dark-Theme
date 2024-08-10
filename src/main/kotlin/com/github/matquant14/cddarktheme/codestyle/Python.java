package com.github.matquant14.cddarktheme.codestyle;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;


public class Python extends CustomCodeStyleSettings {
    public Boolean SPACE_AROUND_EQ_IN_NAMED_PARAMETER = true;
    public Boolean SPACE_AROUND_EQ_IN_KEYWORD_ARGUMENT = true;
    public Boolean USE_CONTINUATION_INDENT_FOR_ARGUMENTS = true;
    public Boolean USE_CONTINUATION_INDENT_FOR_COLLECTION_AND_COMPREHENSIONS = true;
    public Boolean OPTIMIZE_IMPORTS_JOIN_FROM_IMPORTS_WITH_SAME_SOURCE = true;
    public Boolean FROM_IMPORT_PARENTHESES_FORCE_IF_MULTILINE = true;
    public Boolean HANG_CLOSING_BRACKETS = true;


    public Python(CodeStyleSettings settings) {
        super("Python", settings);
    }
}
