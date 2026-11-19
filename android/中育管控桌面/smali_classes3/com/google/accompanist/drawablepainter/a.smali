.class public final synthetic Lcom/google/accompanist/drawablepainter/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/google/accompanist/drawablepainter/DrawablePainter;


# direct methods
.method public synthetic constructor <init>(Lcom/google/accompanist/drawablepainter/DrawablePainter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/accompanist/drawablepainter/a;->a:Lcom/google/accompanist/drawablepainter/DrawablePainter;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/accompanist/drawablepainter/a;->a:Lcom/google/accompanist/drawablepainter/DrawablePainter;

    invoke-static {v0}, Lcom/google/accompanist/drawablepainter/DrawablePainter;->a(Lcom/google/accompanist/drawablepainter/DrawablePainter;)Lcom/google/accompanist/drawablepainter/DrawablePainter$callback$2$1;

    move-result-object v0

    return-object v0
.end method
