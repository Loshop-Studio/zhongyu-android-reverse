package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyMatrix$Matrix;
import java.io.IOException;

/* renamed from: b4.a0 */
/* loaded from: classes3.dex */
public final class C3111a0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C3115b0 c3115b0NewBuilder = EzyMatrix$Matrix.newBuilder();
        try {
            c3115b0NewBuilder.m2074h(codedInputStream, extensionRegistryLite);
            return c3115b0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3115b0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c3115b0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c3115b0NewBuilder.buildPartial());
        }
    }
}
