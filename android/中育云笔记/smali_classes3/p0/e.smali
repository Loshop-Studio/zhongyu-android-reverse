.class public final Lp0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/h;


# static fields
.field public static final b:Lh0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp0/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lp0/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp0/e;->b:Lh0/h;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c()Lp0/e;
    .locals 1

    .line 1
    sget-object v0, Lp0/e;->b:Lh0/h;

    .line 2
    .line 3
    check-cast v0, Lp0/e;

    .line 4
    .line 5
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lj0/j;II)Lj0/j;
    .locals 0

    .line 1
    return-object p2
.end method

.method public b(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method
