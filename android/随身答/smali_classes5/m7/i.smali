.class public final synthetic Lm7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lm7/n;

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/zykj/view/ui/crop/EzyCropTheme;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lm7/n;Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/i;->a:Lm7/n;

    iput-object p2, p0, Lm7/i;->b:Landroid/net/Uri;

    iput-boolean p3, p0, Lm7/i;->c:Z

    iput-object p4, p0, Lm7/i;->d:Lcom/zykj/view/ui/crop/EzyCropTheme;

    iput-object p5, p0, Lm7/i;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lm7/i;->a:Lm7/n;

    iget-object v1, p0, Lm7/i;->b:Landroid/net/Uri;

    iget-boolean v2, p0, Lm7/i;->c:Z

    iget-object v3, p0, Lm7/i;->d:Lcom/zykj/view/ui/crop/EzyCropTheme;

    iget-object v4, p0, Lm7/i;->e:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3, v4}, Lm7/n;->h(Lm7/n;Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
