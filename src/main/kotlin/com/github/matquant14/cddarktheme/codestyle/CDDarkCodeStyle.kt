package com.github.matquant14.cddarktheme.codestyle

import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle.CodeStyleScheme
import com.intellij.psi.codeStyle.CodeStyleSettingsManager
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.FileCodeStyleProvider
import org.jetbrains.annotations.NotNull

import com.intellij.psi.impl.source.codeStyle.CodeStyleSchemeImpl
import java.io.InputStream
import javax.xml.parsers.DocumentBuilderFactory

fun createSchemeFromStream(inputStream: InputStream, schemeName: String): CodeStyleScheme {
    val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    val document = builder.parse(inputStream)

    // Here you should parse the XML document and populate a CodeStyleSettings object
    val settings = CodeStyleSettingsManager.getInstance().createSettings()

    // This is just an example, you should populate settings according to your XML

    return CodeStyleSchemeImpl(schemeName, false, null).apply {
        codeStyleSettings = settings
    }
}
class CDDarkCodeStyle : FileCodeStyleProvider {

    fun getSchemes(): CodeStyleSettings {
        val defaultSchemes = CodeStyleSettings.l
        val stream = javaClass.classLoader.getResourceAsStream("resources/CD_Dark_Codestyle.xml")
        val myScheme = stream?.let { createSchemeFromStream(it, "CD_Dark_Codestyle") }
        return defaultSchemes + myScheme
    }

    override fun getSettings(file: PsiFile): CodeStyleSettings? {
        TODO("Not yet implemented")
    }
}