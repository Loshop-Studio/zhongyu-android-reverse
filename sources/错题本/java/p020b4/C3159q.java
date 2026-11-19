package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyHeader$BackgroundLineConfig;
import java.io.IOException;

/* renamed from: b4.q */
/* loaded from: classes3.dex */
public final class C3159q extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C3162r c3162rNewBuilder = EzyHeader$BackgroundLineConfig.newBuilder();
        try {
            c3162rNewBuilder.m2113h(codedInputStream, extensionRegistryLite);
            return c3162rNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3162rNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c3162rNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c3162rNewBuilder.buildPartial());
        }
    }
}
