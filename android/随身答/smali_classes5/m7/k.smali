.class public final synthetic Lm7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lm7/n;

.field public final synthetic c:Landroid/net/Uri;

.field public final synthetic d:Lcom/zykj/view/ui/crop/EzyCropTheme;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLm7/n;Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm7/k;->a:Z

    iput-object p2, p0, Lm7/k;->b:Lm7/n;

    iput-object p3, p0, Lm7/k;->c:Landroid/net/Uri;

    iput-object p4, p0, Lm7/k;->d:Lcom/zykj/view/ui/crop/EzyCropTheme;

    iput-object p5, p0, Lm7/k;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lm7/k;->a:Z

    iget-object v1, p0, Lm7/k;->b:Lm7/n;

    iget-object v2, p0, Lm7/k;->c:Landroid/net/Uri;

    iget-object v3, p0, Lm7/k;->d:Lcom/zykj/view/ui/crop/EzyCropTheme;

    iget-object v4, p0, Lm7/k;->e:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-static/range {v0 .. v5}, Lm7/n;->a(ZLm7/n;Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
