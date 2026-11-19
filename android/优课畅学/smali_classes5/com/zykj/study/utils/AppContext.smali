.class public abstract enum Lcom/zykj/study/utils/AppContext;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/utils/AppContext$INSTANCE;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/study/utils/AppContext;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/study/utils/AppContext;

.field public static final synthetic b:[Lcom/zykj/study/utils/AppContext;

.field public static final synthetic c:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/utils/AppContext$INSTANCE;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/utils/AppContext$INSTANCE;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/study/utils/AppContext;->a:Lcom/zykj/study/utils/AppContext;

    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/study/utils/AppContext;->a()[Lcom/zykj/study/utils/AppContext;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/zykj/study/utils/AppContext;->b:[Lcom/zykj/study/utils/AppContext;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/zykj/study/utils/AppContext;->c:Lp7/a;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/study/utils/AppContext;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/study/utils/AppContext;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/utils/AppContext;->a:Lcom/zykj/study/utils/AppContext;

    filled-new-array {v0}, [Lcom/zykj/study/utils/AppContext;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/study/utils/AppContext;
    .locals 1

    const-class v0, Lcom/zykj/study/utils/AppContext;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/utils/AppContext;

    return-object p0
.end method

.method public static values()[Lcom/zykj/study/utils/AppContext;
    .locals 1

    sget-object v0, Lcom/zykj/study/utils/AppContext;->b:[Lcom/zykj/study/utils/AppContext;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/study/utils/AppContext;

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract c(Landroid/content/Context;)V
.end method
