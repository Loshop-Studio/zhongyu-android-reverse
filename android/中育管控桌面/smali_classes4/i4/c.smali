.class public abstract Li4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li4/c$a;
    }
.end annotation


# static fields
.field public static final a:Li4/c$a;

.field public static final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li4/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li4/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li4/c;->a:Li4/c$a;

    .line 8
    .line 9
    new-instance v0, Li4/b;

    .line 10
    .line 11
    invoke-direct {v0}, Li4/b;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Li4/c;->b:Lkotlin/Lazy;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic a()[Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Li4/c;->c()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, Li4/c;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final c()[Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/high16 v1, 0x7f030000

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
