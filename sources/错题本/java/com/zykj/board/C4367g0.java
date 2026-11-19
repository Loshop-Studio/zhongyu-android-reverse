package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import java.io.IOException;

/* renamed from: com.zykj.board.g0 */
/* loaded from: classes3.dex */
public final class C4367g0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4369h0 c4369h0NewBuilder = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
        try {
            c4369h0NewBuilder.m3751h(codedInputStream, extensionRegistryLite);
            return c4369h0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4369h0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4369h0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4369h0NewBuilder.buildPartial());
        }
    }
}
