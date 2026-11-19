# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/j$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/proto/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/j;->c()Lcom/zykj/huiwei/launcher/proto/j;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/proto/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/j$b;-><init>()V

    return-void
.end method


# virtual methods
.method public clearIgnoreVersionCode()Lcom/zykj/huiwei/launcher/proto/j$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/j;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/proto/j;->a(Lcom/zykj/huiwei/launcher/proto/j;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getIgnoreVersionCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/j;->getIgnoreVersionCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public setIgnoreVersionCode(I)Lcom/zykj/huiwei/launcher/proto/j$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/j;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/proto/j;->b(Lcom/zykj/huiwei/launcher/proto/j;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
