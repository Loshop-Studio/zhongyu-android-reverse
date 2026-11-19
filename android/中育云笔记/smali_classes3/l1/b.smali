.class public final synthetic Ll1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;

.field public final synthetic d:I

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Landroidx/recyclerview/widget/DiffUtil$DiffResult;

.field public final synthetic g:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;ILjava/util/List;Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/b;->c:Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;

    iput p2, p0, Ll1/b;->d:I

    iput-object p3, p0, Ll1/b;->e:Ljava/util/List;

    iput-object p4, p0, Ll1/b;->f:Landroidx/recyclerview/widget/DiffUtil$DiffResult;

    iput-object p5, p0, Ll1/b;->g:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Ll1/b;->c:Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;

    iget v1, p0, Ll1/b;->d:I

    iget-object v2, p0, Ll1/b;->e:Ljava/util/List;

    iget-object v3, p0, Ll1/b;->f:Landroidx/recyclerview/widget/DiffUtil$DiffResult;

    iget-object v4, p0, Ll1/b;->g:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;->b(Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;ILjava/util/List;Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/lang/Runnable;)V

    return-void
.end method
