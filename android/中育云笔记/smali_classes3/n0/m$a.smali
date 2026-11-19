.class public Ln0/m$a;
.super Ld1/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln0/m;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic e:Ln0/m;


# direct methods
.method public constructor <init>(Ln0/m;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln0/m$a;->e:Ln0/m;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Ld1/g;-><init>(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ln0/m$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ln0/m$a;->n(Ln0/m$b;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n(Ln0/m$b;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ln0/m$b;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
