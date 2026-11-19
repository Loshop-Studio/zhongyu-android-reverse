.class public final synthetic Lf5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lj5/d;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:Lk5/t;


# direct methods
.method public synthetic constructor <init>(Lj5/d;IIIIIZZLk5/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/k;->a:Lj5/d;

    iput p2, p0, Lf5/k;->b:I

    iput p3, p0, Lf5/k;->c:I

    iput p4, p0, Lf5/k;->d:I

    iput p5, p0, Lf5/k;->e:I

    iput p6, p0, Lf5/k;->f:I

    iput-boolean p7, p0, Lf5/k;->g:Z

    iput-boolean p8, p0, Lf5/k;->h:Z

    iput-object p9, p0, Lf5/k;->i:Lk5/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lf5/k;->a:Lj5/d;

    iget v1, p0, Lf5/k;->b:I

    iget v2, p0, Lf5/k;->c:I

    iget v3, p0, Lf5/k;->d:I

    iget v4, p0, Lf5/k;->e:I

    iget v5, p0, Lf5/k;->f:I

    iget-boolean v6, p0, Lf5/k;->g:Z

    iget-boolean v7, p0, Lf5/k;->h:Z

    iget-object v8, p0, Lf5/k;->i:Lk5/t;

    move-object v9, p1

    check-cast v9, Lk5/p;

    move-object v10, p2

    check-cast v10, Lf5/a;

    move-object v11, p3

    check-cast v11, Lk5/g;

    invoke-static/range {v0 .. v11}, Lf5/l;->a(Lj5/d;IIIIIZZLk5/t;Lk5/p;Lf5/a;Lk5/g;)Lk5/i;

    move-result-object p1

    return-object p1
.end method
