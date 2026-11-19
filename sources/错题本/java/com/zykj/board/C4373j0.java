package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzySource$FileSource;
import java.io.IOException;

/* renamed from: com.zykj.board.j0 */
/* loaded from: classes3.dex */
public final class C4373j0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4375k0 c4375k0NewBuilder = EzySource$FileSource.FileInfo.newBuilder();
        try {
            c4375k0NewBuilder.m3775h(codedInputStream, extensionRegistryLite);
            return c4375k0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4375k0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4375k0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4375k0NewBuilder.buildPartial());
        }
    }
}
