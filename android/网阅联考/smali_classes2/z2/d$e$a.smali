.class public final Lz2/d$e$a;
.super Lv2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz2/d$e;->k(ZLz2/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Z

.field public final synthetic g:Lz2/d$e;

.field public final synthetic h:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic i:Z

.field public final synthetic j:Lz2/k;

.field public final synthetic k:Lkotlin/jvm/internal/Ref$LongRef;

.field public final synthetic l:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLz2/d$e;Lkotlin/jvm/internal/Ref$ObjectRef;ZLz2/k;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/d$e$a;->e:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p2, p0, Lz2/d$e$a;->f:Z

    .line 4
    .line 5
    iput-object p5, p0, Lz2/d$e$a;->g:Lz2/d$e;

    .line 6
    .line 7
    iput-object p6, p0, Lz2/d$e$a;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    iput-boolean p7, p0, Lz2/d$e$a;->i:Z

    .line 10
    .line 11
    iput-object p8, p0, Lz2/d$e$a;->j:Lz2/k;

    .line 12
    .line 13
    iput-object p9, p0, Lz2/d$e$a;->k:Lkotlin/jvm/internal/Ref$LongRef;

    .line 14
    .line 15
    iput-object p10, p0, Lz2/d$e$a;->l:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 16
    .line 17
    invoke-direct {p0, p3, p4}, Lv2/a;-><init>(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .line 1
    iget-object v0, p0, Lz2/d$e$a;->g:Lz2/d$e;

    .line 2
    .line 3
    iget-object v0, v0, Lz2/d$e;->b:Lz2/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz2/d;->x()Lz2/d$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lz2/d$e$a;->g:Lz2/d$e;

    .line 10
    .line 11
    iget-object v1, v1, Lz2/d$e;->b:Lz2/d;

    .line 12
    .line 13
    iget-object v2, p0, Lz2/d$e$a;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 14
    .line 15
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lz2/k;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lz2/d$d;->a(Lz2/d;Lz2/k;)V

    .line 20
    .line 21
    .line 22
    const-wide/16 v0, -0x1

    .line 23
    .line 24
    return-wide v0
.end method
