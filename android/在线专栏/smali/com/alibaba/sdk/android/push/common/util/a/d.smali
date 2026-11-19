.class public final enum Lcom/alibaba/sdk/android/push/common/util/a/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/sdk/android/push/common/util/a/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum b:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum c:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum d:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum e:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum f:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum g:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum h:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum i:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum j:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum k:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum l:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum m:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum n:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum o:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum p:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum q:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum r:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum s:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field public static final enum t:Lcom/alibaba/sdk/android/push/common/util/a/d;

.field private static final synthetic v:[Lcom/alibaba/sdk/android/push/common/util/a/d;


# instance fields
.field private final u:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    new-instance v0, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v1, "UNKNOWN_TYPE"

    const/4 v2, 0x0

    const-string v3, "unknown"

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/alibaba/sdk/android/push/common/util/a/d;->a:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v1, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v3, "CONFIG"

    const/4 v4, 0x1

    const/16 v5, 0x64

    const-string v6, "config"

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v1, Lcom/alibaba/sdk/android/push/common/util/a/d;->b:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v3, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v5, "BIND_ACCOUNT"

    const/4 v6, 0x2

    const/16 v7, 0x69

    const-string v8, "Bind account"

    invoke-direct {v3, v5, v6, v7, v8}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v3, Lcom/alibaba/sdk/android/push/common/util/a/d;->c:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v5, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v7, "UNBIND_ACCOUNT"

    const/4 v8, 0x3

    const/16 v9, 0x6a

    const-string v10, "Unbind account"

    invoke-direct {v5, v7, v8, v9, v10}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v5, Lcom/alibaba/sdk/android/push/common/util/a/d;->d:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v7, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v9, "BIND_TAG_TO_DEVICE"

    const/4 v10, 0x4

    const/16 v11, 0x65

    const-string v12, "Bind tag to device"

    invoke-direct {v7, v9, v10, v11, v12}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v7, Lcom/alibaba/sdk/android/push/common/util/a/d;->e:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v9, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v11, "BIND_TAG_TO_ACCOUNT"

    const/4 v12, 0x5

    const/16 v13, 0x66

    const-string v14, "Bind tag to account"

    invoke-direct {v9, v11, v12, v13, v14}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v9, Lcom/alibaba/sdk/android/push/common/util/a/d;->f:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v11, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "BIND_TAG_TO_ALIAS"

    const/4 v14, 0x6

    const/16 v15, 0x67

    const-string v12, "Bind tag to alias"

    invoke-direct {v11, v13, v14, v15, v12}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v11, Lcom/alibaba/sdk/android/push/common/util/a/d;->g:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v12, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "BIND_ALIAS"

    const/4 v15, 0x7

    const/16 v14, 0x68

    const-string v10, "Add alias to device"

    invoke-direct {v12, v13, v15, v14, v10}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v12, Lcom/alibaba/sdk/android/push/common/util/a/d;->h:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v10, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "UNBIND_TAG_TO_DEVICE"

    const/16 v14, 0x8

    const/16 v15, 0x44d

    const-string v8, "Unbind tag from device"

    invoke-direct {v10, v13, v14, v15, v8}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v10, Lcom/alibaba/sdk/android/push/common/util/a/d;->i:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v8, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "UNBIND_TAG_TO_ACCOUNT"

    const/16 v15, 0x9

    const/16 v14, 0x44e

    const-string v6, "Unbind tag from account"

    invoke-direct {v8, v13, v15, v14, v6}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v8, Lcom/alibaba/sdk/android/push/common/util/a/d;->j:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v6, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "UNBIND_TAG_TO_ALIAS"

    const/16 v14, 0xa

    const/16 v15, 0x44f

    const-string v4, "Unbind tag from alias"

    invoke-direct {v6, v13, v14, v15, v4}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v6, Lcom/alibaba/sdk/android/push/common/util/a/d;->k:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v4, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "UNBIND_ALIAS"

    const/16 v15, 0xb

    const/16 v14, 0x450

    const-string v2, "Remove alias"

    invoke-direct {v4, v13, v15, v14, v2}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lcom/alibaba/sdk/android/push/common/util/a/d;->l:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v2, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "LIST_TAGS"

    const/16 v14, 0xc

    const/16 v15, 0x4b1

    move-object/from16 v16, v4

    const-string v4, "List tags of device"

    invoke-direct {v2, v13, v14, v15, v4}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v2, Lcom/alibaba/sdk/android/push/common/util/a/d;->m:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v4, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "LIST_ALIASES"

    const/16 v15, 0xd

    const/16 v14, 0x4b2

    move-object/from16 v17, v2

    const-string v2, "List aliases of device"

    invoke-direct {v4, v13, v15, v14, v2}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lcom/alibaba/sdk/android/push/common/util/a/d;->n:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v2, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "TURN_OFF_PUSH"

    const/16 v14, 0xe

    const/16 v15, 0x4b3

    move-object/from16 v18, v4

    const-string v4, "Turn off push"

    invoke-direct {v2, v13, v14, v15, v4}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v2, Lcom/alibaba/sdk/android/push/common/util/a/d;->o:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v4, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "TURN_ON_PUSH"

    const/16 v15, 0xf

    const/16 v14, 0x4b4

    move-object/from16 v19, v2

    const-string v2, "Turn on push"

    invoke-direct {v4, v13, v15, v14, v2}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lcom/alibaba/sdk/android/push/common/util/a/d;->p:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v2, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "CHECK_PUSH_STATUS"

    const/16 v14, 0x10

    const/16 v15, 0x4b5

    move-object/from16 v20, v4

    const-string v4, "Check push status"

    invoke-direct {v2, v13, v14, v15, v4}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v2, Lcom/alibaba/sdk/android/push/common/util/a/d;->q:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v4, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "BIND_PHONE_NUMBER"

    const/16 v15, 0x11

    const/16 v14, 0x4b6

    move-object/from16 v21, v2

    const-string v2, "bind phone number to devices"

    invoke-direct {v4, v13, v15, v14, v2}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lcom/alibaba/sdk/android/push/common/util/a/d;->r:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v2, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "UNBIND_PHONE_NUMBER"

    const/16 v14, 0x12

    const/16 v15, 0x4b7

    move-object/from16 v22, v4

    const-string v4, "unbind phone number to devices"

    invoke-direct {v2, v13, v14, v15, v4}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v2, Lcom/alibaba/sdk/android/push/common/util/a/d;->s:Lcom/alibaba/sdk/android/push/common/util/a/d;

    new-instance v4, Lcom/alibaba/sdk/android/push/common/util/a/d;

    const-string v13, "ON_APP_START"

    const/16 v15, 0x13

    const/16 v14, 0x4b8

    move-object/from16 v23, v2

    const-string v2, "on app start"

    invoke-direct {v4, v13, v15, v14, v2}, Lcom/alibaba/sdk/android/push/common/util/a/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lcom/alibaba/sdk/android/push/common/util/a/d;->t:Lcom/alibaba/sdk/android/push/common/util/a/d;

    const/16 v2, 0x14

    new-array v2, v2, [Lcom/alibaba/sdk/android/push/common/util/a/d;

    const/4 v13, 0x0

    aput-object v0, v2, v13

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v3, v2, v0

    const/4 v0, 0x3

    aput-object v5, v2, v0

    const/4 v0, 0x4

    aput-object v7, v2, v0

    const/4 v0, 0x5

    aput-object v9, v2, v0

    const/4 v0, 0x6

    aput-object v11, v2, v0

    const/4 v0, 0x7

    aput-object v12, v2, v0

    const/16 v0, 0x8

    aput-object v10, v2, v0

    const/16 v0, 0x9

    aput-object v8, v2, v0

    const/16 v0, 0xa

    aput-object v6, v2, v0

    const/16 v0, 0xb

    aput-object v16, v2, v0

    const/16 v0, 0xc

    aput-object v17, v2, v0

    const/16 v0, 0xd

    aput-object v18, v2, v0

    const/16 v0, 0xe

    aput-object v19, v2, v0

    const/16 v0, 0xf

    aput-object v20, v2, v0

    const/16 v0, 0x10

    aput-object v21, v2, v0

    const/16 v0, 0x11

    aput-object v22, v2, v0

    const/16 v0, 0x12

    aput-object v23, v2, v0

    aput-object v4, v2, v15

    sput-object v2, Lcom/alibaba/sdk/android/push/common/util/a/d;->v:[Lcom/alibaba/sdk/android/push/common/util/a/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/alibaba/sdk/android/push/common/util/a/d;->u:I

    return-void
.end method

.method public static b()I
    .locals 1

    const/16 v0, 0x64

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/sdk/android/push/common/util/a/d;
    .locals 1

    const-class v0, Lcom/alibaba/sdk/android/push/common/util/a/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/alibaba/sdk/android/push/common/util/a/d;

    return-object p0
.end method

.method public static values()[Lcom/alibaba/sdk/android/push/common/util/a/d;
    .locals 1

    sget-object v0, Lcom/alibaba/sdk/android/push/common/util/a/d;->v:[Lcom/alibaba/sdk/android/push/common/util/a/d;

    invoke-virtual {v0}, [Lcom/alibaba/sdk/android/push/common/util/a/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/alibaba/sdk/android/push/common/util/a/d;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/alibaba/sdk/android/push/common/util/a/d;->u:I

    return v0
.end method
