.class public final Lc9/j$a;
.super Lc9/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final d:Lc9/c;


# direct methods
.method public constructor <init>(Lc9/w;Ll8/e$a;Lc9/f;Lc9/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc9/j;-><init>(Lc9/w;Ll8/e$a;Lc9/f;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lc9/j$a;->d:Lc9/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Lc9/b;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lc9/j$a;->d:Lc9/c;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lc9/c;->b(Lc9/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
