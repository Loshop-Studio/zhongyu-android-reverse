.class public final synthetic Lm3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/gallery/ui/share/page/ShareViewModel;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/s;->a:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    iput-object p2, p0, Lm3/s;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lm3/s;->a:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    iget-object v1, p0, Lm3/s;->b:Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/gallery/ui/share/page/c;->h(Lcom/zykj/gallery/ui/share/page/ShareViewModel;Landroid/content/Context;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
