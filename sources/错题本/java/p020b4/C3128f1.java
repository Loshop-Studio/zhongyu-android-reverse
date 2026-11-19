package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4365f0;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import java.io.IOException;

/* renamed from: b4.f1 */
/* loaded from: classes3.dex */
public final class C3128f1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4365f0 c4365f0NewBuilder = EzyRouterRecord$RouterRecord.newBuilder();
        try {
            c4365f0NewBuilder.m3740n(codedInputStream, extensionRegistryLite);
            return c4365f0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4365f0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4365f0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4365f0NewBuilder.buildPartial());
        }
    }
}
