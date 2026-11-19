.class public final synthetic Li9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic a:Lm9/d;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:Ln9/t;


# direct methods
.method public synthetic constructor <init>(Lm9/d;IIIIIZZLn9/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/k;->a:Lm9/d;

    iput p2, p0, Li9/k;->b:I

    iput p3, p0, Li9/k;->c:I

    iput p4, p0, Li9/k;->d:I

    iput p5, p0, Li9/k;->e:I

    iput p6, p0, Li9/k;->f:I

    iput-boolean p7, p0, Li9/k;->g:Z

    iput-boolean p8, p0, Li9/k;->h:Z

    iput-object p9, p0, Li9/k;->i:Ln9/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Li9/k;->a:Lm9/d;

    iget v1, p0, Li9/k;->b:I

    iget v2, p0, Li9/k;->c:I

    iget v3, p0, Li9/k;->d:I

    iget v4, p0, Li9/k;->e:I

    iget v5, p0, Li9/k;->f:I

    iget-boolean v6, p0, Li9/k;->g:Z

    iget-boolean v7, p0, Li9/k;->h:Z

    iget-object v8, p0, Li9/k;->i:Ln9/t;

    move-object v9, p1

    check-cast v9, Ln9/p;

    move-object v10, p2

    check-cast v10, Li9/a;

    move-object v11, p3

    check-cast v11, Ln9/g;

    invoke-static/range {v0 .. v11}, Li9/l;->a(Lm9/d;IIIIIZZLn9/t;Ln9/p;Li9/a;Ln9/g;)Ln9/i;

    move-result-object p1

    return-object p1
.end method
