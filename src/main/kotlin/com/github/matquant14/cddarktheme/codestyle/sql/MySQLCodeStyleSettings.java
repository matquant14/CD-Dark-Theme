package com.github.matquant14.cddarktheme.codestyle.sql;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class MySQLCodeStyleSettings extends CustomCodeStyleSettings {

    public Boolean QUERY_ALIGN_LINE_COMMENTS = false;
    public Integer SUBQUERY_CONTENT = 1;
    public Integer SUBQUERY_CLOSING = 4;
    public Boolean SET_ALIGN_EQUAL_SIGN = false;
    public Integer SELECT_EL_WRAP = 3;
    public Integer SELECT_KEEP_N_ITEMS_IN_LINE = 4;
    public Boolean SELECT_ALIGN_AS = false;
    public Boolean FROM_INDENT_JOIN = false;
    public Integer FROM_ONLY_JOIN_INDENT = 2;

    public MySQLCodeStyleSettings(CodeStyleSettings settings) {
        super("MySQLCodeStyleSettings", settings);
    }
}
