.class public final Lsd/z1;
.super Lsd/p1;
.source "SourceFile"


# instance fields
.field public final g:Lvc/c;


# direct methods
.method public constructor <init>(Lvc/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsd/p1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsd/z1;->g:Lvc/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lsd/z1;->g:Lvc/c;

    .line 2
    .line 3
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 4
    .line 5
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
