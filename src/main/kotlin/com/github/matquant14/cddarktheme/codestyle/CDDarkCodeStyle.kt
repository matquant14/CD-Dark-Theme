package com.github.matquant14.cddarktheme.codestyle

import com.intellij.openapi.extensions.ExtensionPointName
import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle.CodeStyleScheme
import com.intellij.psi.codeStyle.CodeStyleSettingsManager
import com.intellij.psi.codeStyle.modifier.CodeStyleSettingsModifier
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.FileCodeStyleProvider
import org.jetbrains.annotations.NotNull

import com.intellij.psi.impl.source.codeStyle.CodeStyleSchemeImpl
import java.io.InputStream
import javax.xml.parsers.DocumentBuilderFactory

class CDDarkCodeStyle : FileCodeStyleProvider {

    override fun getSettings(@NotNull file: PsiFile): CodeStyleSettings? {
        val stream = javaClass.classLoader.getResourceAsStream("resources/CDDarkCodestyle.xml")
        val myScheme = stream?.let { createSchemeFromStream(it, "CDDarkCodeStyle") }
        return myScheme as? CodeStyleSettings
    }

    private fun createSchemeFromStream(inputStream: InputStream, schemeName: String): CodeStyleScheme {
        val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
        val document = builder.parse(inputStream)

        val settings = CodeStyleSettingsManager.getInstance().createSettings()

        return CodeStyleSchemeImpl(schemeName, false, null).apply {
            codeStyleSettings = settings
        }
    }
}
