.class public final Lcom/bumptech/glide/c;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final j:Lcom/bumptech/glide/a;


# instance fields
.field public final a:Lc0/g;

.field public final b:Lcom/bumptech/glide/d;

.field public final c:Lc8/c;

.field public final d:Lio/reactivex/internal/operators/observable/h;

.field public final e:Ljava/util/List;

.field public final f:Landroidx/collection/ArrayMap;

.field public final g:Lcom/bumptech/glide/load/engine/c;

.field public final h:I

.field public i:Lr0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bumptech/glide/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lt0/b;->a:Lt0/a;

    .line 7
    .line 8
    iput-object v1, v0, Lcom/bumptech/glide/a;->a:Lt0/a;

    .line 9
    .line 10
    sput-object v0, Lcom/bumptech/glide/c;->j:Lcom/bumptech/glide/a;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc0/g;Lcom/bumptech/glide/d;Lc8/c;Lio/reactivex/internal/operators/observable/h;Landroidx/collection/ArrayMap;Ljava/util/List;Lcom/bumptech/glide/load/engine/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/bumptech/glide/c;->a:Lc0/g;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 11
    .line 12
    iput-object p4, p0, Lcom/bumptech/glide/c;->c:Lc8/c;

    .line 13
    .line 14
    iput-object p5, p0, Lcom/bumptech/glide/c;->d:Lio/reactivex/internal/operators/observable/h;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/bumptech/glide/c;->e:Ljava/util/List;

    .line 17
    .line 18
    iput-object p6, p0, Lcom/bumptech/glide/c;->f:Landroidx/collection/ArrayMap;

    .line 19
    .line 20
    iput-object p8, p0, Lcom/bumptech/glide/c;->g:Lcom/bumptech/glide/load/engine/c;

    .line 21
    .line 22
    const/4 p1, 0x4

    .line 23
    iput p1, p0, Lcom/bumptech/glide/c;->h:I

    .line 24
    .line 25
    return-void
.end method
