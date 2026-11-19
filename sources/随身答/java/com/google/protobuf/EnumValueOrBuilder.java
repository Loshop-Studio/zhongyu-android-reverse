package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface EnumValueOrBuilder extends MessageOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i9);

    int getOptionsCount();

    List<Option> getOptionsList();

    OptionOrBuilder getOptionsOrBuilder(int i9);

    List<? extends OptionOrBuilder> getOptionsOrBuilderList();
}
