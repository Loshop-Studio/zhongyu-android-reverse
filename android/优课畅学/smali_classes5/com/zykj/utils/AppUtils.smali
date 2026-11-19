.class public abstract enum Lcom/zykj/utils/AppUtils;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/utils/AppUtils$INSTANCE;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/utils/AppUtils;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/utils/AppUtils;

.field public static final synthetic b:[Lcom/zykj/utils/AppUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/zykj/utils/AppUtils$INSTANCE;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/utils/AppUtils$INSTANCE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/utils/AppUtils;->a:Lcom/zykj/utils/AppUtils;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/zykj/utils/AppUtils;

    aput-object v0, v1, v2

    sput-object v1, Lcom/zykj/utils/AppUtils;->b:[Lcom/zykj/utils/AppUtils;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/zykj/utils/AppUtils;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/utils/AppUtils;
    .locals 1

    const-class v0, Lcom/zykj/utils/AppUtils;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/utils/AppUtils;

    return-object p0
.end method

.method public static values()[Lcom/zykj/utils/AppUtils;
    .locals 1

    sget-object v0, Lcom/zykj/utils/AppUtils;->b:[Lcom/zykj/utils/AppUtils;

    invoke-virtual {v0}, [Lcom/zykj/utils/AppUtils;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/utils/AppUtils;

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroid/content/Context;
.end method

.method public abstract b(Landroid/content/Context;)V
.end method
