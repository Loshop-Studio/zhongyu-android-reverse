package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface EnumValueOrBuilder extends MessageOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i6);

    int getOptionsCount();

    List<Option> getOptionsList();

    OptionOrBuilder getOptionsOrBuilder(int i6);

    List<? extends OptionOrBuilder> getOptionsOrBuilderList();
}
