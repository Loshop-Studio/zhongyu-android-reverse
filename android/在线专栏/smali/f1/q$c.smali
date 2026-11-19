.class Lf1/q$c;
.super Lp0/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/q;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lf1/q;


# direct methods
.method constructor <init>(Lf1/q;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Lf1/q$c;->d:Lf1/q;

    invoke-direct {p0, p2}, Lp0/l;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM WorkProgress"

    return-object v0
.end method
