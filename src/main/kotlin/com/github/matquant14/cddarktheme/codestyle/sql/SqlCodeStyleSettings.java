package com.github.matquant14.cddarktheme.codestyle.sql;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class SqlCodeStyleSettings extends CustomCodeStyleSettings {

    public Integer KEYWORD_CASE = 2;
    public Integer TYPE_CASE = 1;
    public Integer CUSTOM_TYPE_CASE = 1;
    public Integer ALIAS_CASE = 1;
    public Integer BUILT_IN_CASE = 2;
    public Boolean ORIGINAL_CASE = true;
    public Integer QUERY_EL_COMMA = 2;
    public Integer QUERY_IN_ONE_STRING = 3;
    public Boolean QUERY_TRUE_INDENT = false;
    public Boolean QUERY_ALIGN_LINE_COMMENTS = false;
    public Integer SUBQUERY_OPENING = 1;
    public Integer SUBQUERY_CONTENT = 4;
    public Integer SUBQUERY_CLOSING = 4;
    public Integer SET_EL_WRAP = 3;
    public Boolean SET_ALIGN_EQUAL_SIGN = false;
    public Integer WITH_EL_WRAP = 2;
    public Integer SELECT_EL_WRAP = 2;
    public Integer SELECT_KEEP_N_ITEMS_IN_LINE = 5;
    public Boolean SELECT_ALIGN_AS = false;
    public Integer FROM_EL_WRAP = 3;
    public Boolean FROM_INDENT_JOIN = false;
    public Integer FROM_ONLY_JOIN_INDENT = 2;
    public Integer WHERE_EL_LINE = 1;
    public Integer WHERE_EL_WRAP = 3;
    public Integer WHERE_EL_BOUND = 0;
    public Boolean CONSTRAINT_WRAP_4 = true;
    public Boolean POST_OPT_WRAP_1 = true;
    public Boolean VIEW_INDENT_QUERY = true;
    public Integer SCRIPT_STMT_SEMICOLON_WRAP = 2;
    public Boolean IMP_DECLARE_ALIGN_TYPE = false;
    public Boolean IMP_DECLARE_ALIGN_EQ = false;
    public Boolean EXPR_CASE_THEN_WRAP = true;
    public Boolean EXPR_CASE_THEN_ALIGN = true;
    public Integer EXPR_CASE_END = 1;

    public SqlCodeStyleSettings(CodeStyleSettings settings) {
        super("SqlCodeStyleSettings", settings);
    }
}