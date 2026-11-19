.class public Lr/m$a;
.super Lh0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/m;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic e:Lr/m;


# direct methods
.method public constructor <init>(Lr/m;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/m$a;->e:Lr/m;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lh0/g;-><init>(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lr/m$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lr/m$a;->m(Lr/m$b;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Lr/m$b;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lr/m$b;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
