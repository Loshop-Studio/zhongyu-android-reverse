package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyCommand$CommandSource;
import java.io.IOException;

/* renamed from: com.zykj.board.p */
/* loaded from: classes3.dex */
public final class C4384p extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4386q c4386qNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphData.newBuilder();
        try {
            c4386qNewBuilder.m3810i(codedInputStream, extensionRegistryLite);
            return c4386qNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4386qNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4386qNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4386qNewBuilder.buildPartial());
        }
    }
}
