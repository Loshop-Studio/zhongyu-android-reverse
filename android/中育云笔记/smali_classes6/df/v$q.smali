.class public final Ldf/v$q;
.super Ldf/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf/v;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldf/v$q;->a:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ldf/a0;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/v$q;->a:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p1, v0, p2}, Ldf/a0;->h(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
