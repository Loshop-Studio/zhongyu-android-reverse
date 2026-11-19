package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyCommand$CommandSource;
import java.io.IOException;

/* renamed from: com.zykj.board.l */
/* loaded from: classes3.dex */
public final class C4376l extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4378m c4378mNewBuilder = EzyCommand$CommandSource.CommandInfo.CursorMove.newBuilder();
        try {
            c4378mNewBuilder.m3784g(codedInputStream, extensionRegistryLite);
            return c4378mNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4378mNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4378mNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4378mNewBuilder.buildPartial());
        }
    }
}
