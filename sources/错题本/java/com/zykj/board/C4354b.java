package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyCommand$CommandSource;
import java.io.IOException;

/* renamed from: com.zykj.board.b */
/* loaded from: classes3.dex */
public final class C4354b extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4362e c4362eNewBuilder = EzyCommand$CommandSource.CommandInfo.newBuilder();
        try {
            c4362eNewBuilder.m3724h(codedInputStream, extensionRegistryLite);
            return c4362eNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4362eNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4362eNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4362eNewBuilder.buildPartial());
        }
    }
}
