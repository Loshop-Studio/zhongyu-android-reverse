.class public final Lq0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/g;


# static fields
.field public static final b:Lh0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq0/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lq0/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq0/f;->b:Lh0/g;

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

.method public static c()Lq0/f;
    .locals 1

    .line 1
    sget-object v0, Lq0/f;->b:Lh0/g;

    .line 2
    .line 3
    check-cast v0, Lq0/f;

    .line 4
    .line 5
    return-object v0
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Landroid/content/Context;Lk0/j;II)Lk0/j;
    .locals 0

    .line 1
    return-object p2
.end method
