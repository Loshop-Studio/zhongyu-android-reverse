.class public final Lb0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lb0/d;Ly/h;)Lb0/c;
    .locals 1

    .line 1
    new-instance v0, Lb0/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lb0/b;-><init>(Lb0/d;Ly/h;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
