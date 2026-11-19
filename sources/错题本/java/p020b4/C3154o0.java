package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyPaint$Paint;
import java.io.IOException;

/* renamed from: b4.o0 */
/* loaded from: classes3.dex */
public final class C3154o0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C3157p0 c3157p0NewBuilder = EzyPaint$Paint.newBuilder();
        try {
            c3157p0NewBuilder.m2102h(codedInputStream, extensionRegistryLite);
            return c3157p0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3157p0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c3157p0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c3157p0NewBuilder.buildPartial());
        }
    }
}
