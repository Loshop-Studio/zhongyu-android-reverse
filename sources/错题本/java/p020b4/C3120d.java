package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4351a;
import com.zykj.board.EzyCommand$CommandSource;
import java.io.IOException;

/* renamed from: b4.d */
/* loaded from: classes3.dex */
public final class C3120d extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4351a c4351aNewBuilder = EzyCommand$CommandSource.newBuilder();
        try {
            c4351aNewBuilder.m3685h(codedInputStream, extensionRegistryLite);
            return c4351aNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4351aNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4351aNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4351aNewBuilder.buildPartial());
        }
    }
}
