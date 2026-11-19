.class public abstract enum Lcom/zykj/base/utils/ActivityCollectionHelper;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/base/utils/ActivityCollectionHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Lcom/zykj/base/utils/ActivityCollectionHelper;

.field public static final enum INSTANCE:Lcom/zykj/base/utils/ActivityCollectionHelper;


# direct methods
.method private static final synthetic $values()[Lcom/zykj/base/utils/ActivityCollectionHelper;
    .locals 1

    sget-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->INSTANCE:Lcom/zykj/base/utils/ActivityCollectionHelper;

    filled-new-array {v0}, [Lcom/zykj/base/utils/ActivityCollectionHelper;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->INSTANCE:Lcom/zykj/base/utils/ActivityCollectionHelper;

    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/base/utils/ActivityCollectionHelper;->$values()[Lcom/zykj/base/utils/ActivityCollectionHelper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->$VALUES:[Lcom/zykj/base/utils/ActivityCollectionHelper;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->$ENTRIES:Lp7/a;

    .line 22
    .line 23
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/base/utils/ActivityCollectionHelper;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lp7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp7/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->$ENTRIES:Lp7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/base/utils/ActivityCollectionHelper;
    .locals 1

    const-class v0, Lcom/zykj/base/utils/ActivityCollectionHelper;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/base/utils/ActivityCollectionHelper;

    return-object p0
.end method

.method public static values()[Lcom/zykj/base/utils/ActivityCollectionHelper;
    .locals 1

    sget-object v0, Lcom/zykj/base/utils/ActivityCollectionHelper;->$VALUES:[Lcom/zykj/base/utils/ActivityCollectionHelper;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/base/utils/ActivityCollectionHelper;

    return-object v0
.end method


# virtual methods
.method public abstract exitApp()V
.end method

.method public abstract finishAll()V
.end method

.method public abstract register(Landroid/app/Application;)V
.end method

.method public abstract topActivity()Landroid/app/Activity;
.end method

.method public abstract unRegister(Landroid/app/Application;)V
.end method
