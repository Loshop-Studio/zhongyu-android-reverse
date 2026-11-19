.class public final synthetic Ll1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/a;->c:Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;

    iput-object p2, p0, Ll1/a;->d:Ljava/util/List;

    iput-object p3, p0, Ll1/a;->e:Ljava/util/List;

    iput p4, p0, Ll1/a;->f:I

    iput-object p5, p0, Ll1/a;->g:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Ll1/a;->c:Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;

    iget-object v1, p0, Ll1/a;->d:Ljava/util/List;

    iget-object v2, p0, Ll1/a;->e:Ljava/util/List;

    iget v3, p0, Ll1/a;->f:I

    iget-object v4, p0, Ll1/a;->g:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;->a(Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V

    return-void
.end method
