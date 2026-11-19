.class public final synthetic Lm7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lm7/n;

.field public final synthetic c:Lcom/zykj/view/ui/crop/EzyCropTheme;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLm7/n;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm7/l;->a:Z

    iput-object p2, p0, Lm7/l;->b:Lm7/n;

    iput-object p3, p0, Lm7/l;->c:Lcom/zykj/view/ui/crop/EzyCropTheme;

    iput-object p4, p0, Lm7/l;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lm7/l;->a:Z

    iget-object v1, p0, Lm7/l;->b:Lm7/n;

    iget-object v2, p0, Lm7/l;->c:Lcom/zykj/view/ui/crop/EzyCropTheme;

    iget-object v3, p0, Lm7/l;->d:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, v2, v3, p1}, Lm7/n;->j(ZLm7/n;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
