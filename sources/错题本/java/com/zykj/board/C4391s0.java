package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzySource$TextSource;
import java.io.IOException;

/* renamed from: com.zykj.board.s0 */
/* loaded from: classes3.dex */
public final class C4391s0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4393t0 c4393t0NewBuilder = EzySource$TextSource.TextInfo.newBuilder();
        try {
            c4393t0NewBuilder.m3841j(codedInputStream, extensionRegistryLite);
            return c4393t0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4393t0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4393t0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4393t0NewBuilder.buildPartial());
        }
    }
}
