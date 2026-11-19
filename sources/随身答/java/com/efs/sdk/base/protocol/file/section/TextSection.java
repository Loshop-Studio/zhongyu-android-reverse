package com.efs.sdk.base.protocol.file.section;

/* loaded from: classes3.dex */
public class TextSection extends AbsSection {
    private String body;

    public TextSection(String str) {
        super("text");
        this.name = str;
    }

    @Override // com.efs.sdk.base.protocol.file.section.AbsSection
    public String changeToStr() {
        return getDeclarationLine() + AbsSection.SEP_ORIGIN_LINE_BREAK + this.body + AbsSection.SEP_ORIGIN_LINE_BREAK;
    }

    public void setBody(String str) {
        this.body = str;
    }
}
