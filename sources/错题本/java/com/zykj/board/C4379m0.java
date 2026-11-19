package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzySource$GeometrySource;
import java.io.IOException;

/* renamed from: com.zykj.board.m0 */
/* loaded from: classes3.dex */
public final class C4379m0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4381n0 c4381n0NewBuilder = EzySource$GeometrySource.GeometryInfo.newBuilder();
        try {
            c4381n0NewBuilder.m3793l(codedInputStream, extensionRegistryLite);
            return c4381n0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4381n0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4381n0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4381n0NewBuilder.buildPartial());
        }
    }
}
