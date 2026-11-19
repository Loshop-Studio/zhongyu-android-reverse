# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$Header$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyHeader$Header;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:J

.field public f:J

.field public g:J

.field public h:Lcom/zykj/board/EzyHeader$Author;

.field public i:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public j:Ljava/lang/Object;

.field public k:Ljava/util/List;

.field public l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public m:I

.field public n:I

.field public o:Lcom/zykj/board/EzyHeader$MoveConfig;

.field public p:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field public r:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field public t:Lcom/google/protobuf/SingleFieldBuilderV3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->j:Ljava/lang/Object;

    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 6
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$Header$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 8
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->j:Ljava/lang/Object;

    .line 9
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$Header$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$Header$b;-><init>()V

    return-void
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->access$400()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->q()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->B()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->A()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->t()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$Header$b;->x()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private x()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->v()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method


# virtual methods
.method public final A()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->y()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method public final B()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0x100

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public C(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x40

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->z()Lcom/zykj/board/EzyHeader$Author;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->p()Lcom/zykj/board/EzyHeader$Author$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->o(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Author$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x40

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public D(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x1000

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->q()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->s()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->o(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 40
    .line 41
    or-int/lit16 p1, p1, 0x1000

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public E(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_2

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    :sswitch_0
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :sswitch_1
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$Header$b;->x()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 38
    .line 39
    .line 40
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 41
    .line 42
    or-int/lit16 v1, v1, 0x2000

    .line 43
    .line 44
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :sswitch_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->t()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 59
    .line 60
    or-int/lit16 v1, v1, 0x1000

    .line 61
    .line 62
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :sswitch_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->A()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 74
    .line 75
    .line 76
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 77
    .line 78
    or-int/lit16 v1, v1, 0x800

    .line 79
    .line 80
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->n:I

    .line 88
    .line 89
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 90
    .line 91
    or-int/lit16 v1, v1, 0x400

    .line 92
    .line 93
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->m:I

    .line 101
    .line 102
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 103
    .line 104
    or-int/lit16 v1, v1, 0x200

    .line 105
    .line 106
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :sswitch_6
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->parser()Lcom/google/protobuf/Parser;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lcom/zykj/board/EzyHeader$Author;

    .line 118
    .line 119
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 120
    .line 121
    if-nez v2, :cond_1

    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->n()V

    .line 124
    .line 125
    .line 126
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 133
    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->j:Ljava/lang/Object;

    .line 142
    .line 143
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 144
    .line 145
    or-int/lit16 v1, v1, 0x80

    .line 146
    .line 147
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :sswitch_8
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->q()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 160
    .line 161
    .line 162
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 163
    .line 164
    or-int/lit8 v1, v1, 0x40

    .line 165
    .line 166
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 171
    .line 172
    .line 173
    move-result-wide v1

    .line 174
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->g:J

    .line 175
    .line 176
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 177
    .line 178
    or-int/lit8 v1, v1, 0x20

    .line 179
    .line 180
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 185
    .line 186
    .line 187
    move-result-wide v1

    .line 188
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->f:J

    .line 189
    .line 190
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 191
    .line 192
    or-int/lit8 v1, v1, 0x10

    .line 193
    .line 194
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_b
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 199
    .line 200
    .line 201
    move-result-wide v1

    .line 202
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->e:J

    .line 203
    .line 204
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 205
    .line 206
    or-int/lit8 v1, v1, 0x8

    .line 207
    .line 208
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_c
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->d:I

    .line 217
    .line 218
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 219
    .line 220
    or-int/lit8 v1, v1, 0x4

    .line 221
    .line 222
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_d
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->c:I

    .line 231
    .line 232
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 233
    .line 234
    or-int/lit8 v1, v1, 0x2

    .line 235
    .line 236
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_e
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->b:I

    .line 245
    .line 246
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 247
    .line 248
    or-int/2addr v1, v2

    .line 249
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 258
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 259
    .line 260
    .line 261
    throw p1

    .line 262
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 263
    .line 264
    .line 265
    return-object p0

    .line 266
    nop

    .line 267
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_e
        0x10 -> :sswitch_d
        0x18 -> :sswitch_c
        0x20 -> :sswitch_b
        0x28 -> :sswitch_a
        0x30 -> :sswitch_9
        0x3a -> :sswitch_8
        0x42 -> :sswitch_7
        0x4a -> :sswitch_6
        0x50 -> :sswitch_5
        0x58 -> :sswitch_4
        0x62 -> :sswitch_3
        0x6a -> :sswitch_2
        0x72 -> :sswitch_1
    .end sparse-switch
.end method

.method public F(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->G(Lcom/zykj/board/EzyHeader$Header;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public G(Lcom/zykj/board/EzyHeader$Header;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->J()Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->X(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->Y(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->Q(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v2, 0x0

    .line 52
    .line 53
    cmp-long v0, v0, v2

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyHeader$Header$b;->L(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    cmp-long v0, v0, v2

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyHeader$Header$b;->W(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->L()J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    cmp-long v0, v0, v2

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->L()J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyHeader$Header$b;->O(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->R()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->F()Lcom/zykj/board/EzyHeader$Author;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->C(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 105
    .line 106
    .line 107
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->G()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_8

    .line 116
    .line 117
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->n(Lcom/zykj/board/EzyHeader$Header;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->j:Ljava/lang/Object;

    .line 122
    .line 123
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 124
    .line 125
    or-int/lit16 v0, v0, 0x80

    .line 126
    .line 127
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 130
    .line 131
    .line 132
    :cond_8
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 133
    .line 134
    if-nez v0, :cond_a

    .line 135
    .line 136
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->A(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_d

    .line 145
    .line 146
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->A(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 159
    .line 160
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 161
    .line 162
    and-int/lit16 v0, v0, -0x101

    .line 163
    .line 164
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->n()V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 171
    .line 172
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->A(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 177
    .line 178
    .line 179
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_a
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->A(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_d

    .line 192
    .line 193
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 194
    .line 195
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_c

    .line 200
    .line 201
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 202
    .line 203
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 204
    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 208
    .line 209
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->A(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 214
    .line 215
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 216
    .line 217
    and-int/lit16 v1, v1, -0x101

    .line 218
    .line 219
    iput v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 220
    .line 221
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->z()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_b

    .line 226
    .line 227
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->B()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    :cond_b
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_c
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 235
    .line 236
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->A(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 241
    .line 242
    .line 243
    :cond_d
    :goto_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->H()I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_e

    .line 248
    .line 249
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->H()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->M(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 254
    .line 255
    .line 256
    :cond_e
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->M()I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_f

    .line 261
    .line 262
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->M()I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->R(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 267
    .line 268
    .line 269
    :cond_f
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->U()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_10

    .line 274
    .line 275
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->O()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->I(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 280
    .line 281
    .line 282
    :cond_10
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->S()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_11

    .line 287
    .line 288
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->I()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->D(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 293
    .line 294
    .line 295
    :cond_11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->T()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_12

    .line 300
    .line 301
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->N()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->H(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 306
    .line 307
    .line 308
    :cond_12
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->J(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 316
    .line 317
    .line 318
    return-object p0
.end method

.method public H(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x2000

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->q()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->w()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->o(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 40
    .line 41
    or-int/lit16 p1, p1, 0x2000

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public I(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x800

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->z()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->o(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 40
    .line 41
    or-int/lit16 p1, p1, 0x800

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public final J(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public K(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x40

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public L(J)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->e:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public M(I)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->m:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x200

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public N(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0x1000

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public O(J)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->g:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public P(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public Q(I)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->d:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public R(I)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->n:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x400

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public S(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0x2000

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public T(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0x800

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public U(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public final V(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public W(J)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->f:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public X(I)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->b:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public Y(I)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->c:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->d(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->d(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->n()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->e()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->e()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->f()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->f()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->i()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->i()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->i()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->i()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->j(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->j(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->l(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->l(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->l(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->m()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->m()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->m()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->m()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->m()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->m()Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public e()Lcom/zykj/board/EzyHeader$Header;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->f()Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Header;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
.end method

.method public f()Lcom/zykj/board/EzyHeader$Header;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyHeader$Header;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyHeader$a;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->h(Lcom/zykj/board/EzyHeader$Header;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Header$b;->g(Lcom/zykj/board/EzyHeader$Header;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final g(Lcom/zykj/board/EzyHeader$Header;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->b:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Header;->C(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 10
    .line 11
    .line 12
    :cond_0
    and-int/lit8 v1, v0, 0x2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->c:I

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Header;->D(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 19
    .line 20
    .line 21
    :cond_1
    and-int/lit8 v1, v0, 0x4

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->d:I

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Header;->E(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 28
    .line 29
    .line 30
    :cond_2
    and-int/lit8 v1, v0, 0x8

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    iget-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->e:J

    .line 35
    .line 36
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyHeader$Header;->a(Lcom/zykj/board/EzyHeader$Header;J)J

    .line 37
    .line 38
    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x10

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    iget-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->f:J

    .line 44
    .line 45
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyHeader$Header;->c(Lcom/zykj/board/EzyHeader$Header;J)J

    .line 46
    .line 47
    .line 48
    :cond_4
    and-int/lit8 v1, v0, 0x20

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    iget-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->g:J

    .line 53
    .line 54
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyHeader$Header;->g(Lcom/zykj/board/EzyHeader$Header;J)J

    .line 55
    .line 56
    .line 57
    :cond_5
    and-int/lit8 v1, v0, 0x40

    .line 58
    .line 59
    if-eqz v1, :cond_7

    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 62
    .line 63
    if-nez v1, :cond_6

    .line 64
    .line 65
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lcom/zykj/board/EzyHeader$Author;

    .line 73
    .line 74
    :goto_0
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Header;->k(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Author;

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    goto :goto_1

    .line 79
    :cond_7
    const/4 v1, 0x0

    .line 80
    :goto_1
    and-int/lit16 v2, v0, 0x80

    .line 81
    .line 82
    if-eqz v2, :cond_8

    .line 83
    .line 84
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->j:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {p1, v2}, Lcom/zykj/board/EzyHeader$Header;->q(Lcom/zykj/board/EzyHeader$Header;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_8
    and-int/lit16 v2, v0, 0x200

    .line 90
    .line 91
    if-eqz v2, :cond_9

    .line 92
    .line 93
    iget v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->m:I

    .line 94
    .line 95
    invoke-static {p1, v2}, Lcom/zykj/board/EzyHeader$Header;->t(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 96
    .line 97
    .line 98
    :cond_9
    and-int/lit16 v2, v0, 0x400

    .line 99
    .line 100
    if-eqz v2, :cond_a

    .line 101
    .line 102
    iget v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->n:I

    .line 103
    .line 104
    invoke-static {p1, v2}, Lcom/zykj/board/EzyHeader$Header;->u(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 105
    .line 106
    .line 107
    :cond_a
    and-int/lit16 v2, v0, 0x800

    .line 108
    .line 109
    if-eqz v2, :cond_c

    .line 110
    .line 111
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 112
    .line 113
    if-nez v2, :cond_b

    .line 114
    .line 115
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_b
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 123
    .line 124
    :goto_2
    invoke-static {p1, v2}, Lcom/zykj/board/EzyHeader$Header;->v(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 125
    .line 126
    .line 127
    or-int/lit8 v1, v1, 0x2

    .line 128
    .line 129
    :cond_c
    and-int/lit16 v2, v0, 0x1000

    .line 130
    .line 131
    if-eqz v2, :cond_e

    .line 132
    .line 133
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 134
    .line 135
    if-nez v2, :cond_d

    .line 136
    .line 137
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_d
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 145
    .line 146
    :goto_3
    invoke-static {p1, v2}, Lcom/zykj/board/EzyHeader$Header;->w(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 147
    .line 148
    .line 149
    or-int/lit8 v1, v1, 0x4

    .line 150
    .line 151
    :cond_e
    and-int/lit16 v0, v0, 0x2000

    .line 152
    .line 153
    if-eqz v0, :cond_10

    .line 154
    .line 155
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 156
    .line 157
    if-nez v0, :cond_f

    .line 158
    .line 159
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_f
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 167
    .line 168
    :goto_4
    invoke-static {p1, v0}, Lcom/zykj/board/EzyHeader$Header;->x(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 169
    .line 170
    .line 171
    or-int/lit8 v1, v1, 0x8

    .line 172
    .line 173
    :cond_10
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Header;->y(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->u()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->u()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h(Lcom/zykj/board/EzyHeader$Header;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x100

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 20
    .line 21
    and-int/lit16 v0, v0, -0x101

    .line 22
    .line 23
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/board/EzyHeader$Header;->B(Lcom/zykj/board/EzyHeader$Header;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p1, v0}, Lcom/zykj/board/EzyHeader$Header;->B(Lcom/zykj/board/EzyHeader$Header;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public i()Lcom/zykj/board/EzyHeader$Header$b;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->b:I

    .line 8
    .line 9
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->c:I

    .line 10
    .line 11
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->d:I

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->e:J

    .line 16
    .line 17
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->f:J

    .line 18
    .line 19
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->g:J

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 32
    .line 33
    :cond_0
    const-string v2, ""

    .line 34
    .line 35
    iput-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->j:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 42
    .line 43
    iput-object v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 52
    .line 53
    and-int/lit16 v2, v2, -0x101

    .line 54
    .line 55
    iput v2, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 56
    .line 57
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->m:I

    .line 58
    .line 59
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->n:I

    .line 60
    .line 61
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 71
    .line 72
    :cond_2
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 82
    .line 83
    :cond_3
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 93
    .line 94
    :cond_4
    return-object p0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyHeader$Header;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyHeader$Header$b;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public l(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Header$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public m()Lcom/zykj/board/EzyHeader$Header$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyHeader$Header$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->E(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->F(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->E(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->E(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->F(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->E(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->J(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->J(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->J(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public final n()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x100

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->k:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 17
    .line 18
    or-int/lit16 v0, v0, 0x100

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public o()Lcom/zykj/board/EzyHeader$Author;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->z()Lcom/zykj/board/EzyHeader$Author;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$Author;

    .line 19
    .line 20
    return-object v0
.end method

.method public p()Lcom/zykj/board/EzyHeader$Author$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->q()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$Author$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public final q()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->o()Lcom/zykj/board/EzyHeader$Author;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method public r()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->q()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 19
    .line 20
    return-object v0
.end method

.method public s()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x1000

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->t()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->P(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->P(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyHeader$Header$b;->U(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyHeader$Header$b;->U(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->V(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->V(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Header$b;

    move-result-object p1

    return-object p1
.end method

.method public final t()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->r()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method public u()Lcom/zykj/board/EzyHeader$Header;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->J()Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public v()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->q()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 19
    .line 20
    return-object v0
.end method

.method public w()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x2000

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$Header$b;->x()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public y()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 19
    .line 20
    return-object v0
.end method

.method public z()Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x800

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyHeader$Header$b;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Header$b;->A()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 19
    .line 20
    return-object v0
.end method
