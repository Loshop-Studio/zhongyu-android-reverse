package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface TypeOrBuilder extends MessageOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int i9);

    int getFieldsCount();

    List<Field> getFieldsList();

    FieldOrBuilder getFieldsOrBuilder(int i9);

    List<? extends FieldOrBuilder> getFieldsOrBuilderList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i9);

    ByteString getOneofsBytes(int i9);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i9);

    int getOptionsCount();

    List<Option> getOptionsList();

    OptionOrBuilder getOptionsOrBuilder(int i9);

    List<? extends OptionOrBuilder> getOptionsOrBuilderList();

    SourceContext getSourceContext();

    SourceContextOrBuilder getSourceContextOrBuilder();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
