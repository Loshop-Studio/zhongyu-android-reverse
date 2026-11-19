.class public abstract Lxe/a;
.super Lwe/a;
.source "SourceFile"


# instance fields
.field public o:I

.field public p:Ljava/util/ArrayList;

.field public q:Z

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Lorg/apache/commons/net/ProtocolCommandSupport;

.field public u:Z

.field public v:Z

.field public w:Ljava/io/BufferedReader;

.field public x:Ljava/io/BufferedWriter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lwe/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lxe/a;->v:Z

    .line 6
    .line 7
    const/16 v0, 0x15

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lwe/a;->p(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lxe/a;->q:Z

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lxe/a;->r:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "ISO-8859-1"

    .line 26
    .line 27
    iput-object v0, p0, Lxe/a;->s:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v0, Lorg/apache/commons/net/ProtocolCommandSupport;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lorg/apache/commons/net/ProtocolCommandSupport;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lxe/a;->t:Lorg/apache/commons/net/ProtocolCommandSupport;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lxe/a;->B(Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public final B(Z)I
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxe/a;->q:Z

    .line 3
    .line 4
    iget-object v0, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lxe/a;->w:Ljava/io/BufferedReader;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Connection closed without indication."

    .line 16
    .line 17
    if-eqz v0, :cond_c

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x3

    .line 24
    if-lt v2, v3, :cond_b

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    :try_start_0
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    iput v5, p0, Lxe/a;->o:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    iget-object v5, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    const-string v5, "Truncated server reply: \'"

    .line 43
    .line 44
    const-string v6, "\'"

    .line 45
    .line 46
    if-le v2, v3, :cond_6

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v7, 0x2d

    .line 53
    .line 54
    if-ne v3, v7, :cond_3

    .line 55
    .line 56
    :cond_0
    :goto_0
    iget-object v0, p0, Lxe/a;->w:Ljava/io/BufferedReader;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iget-object v2, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lxe/a;->E()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0, v0, v4}, Lxe/a;->R(Ljava/lang/String;Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {p0, v0}, Lxe/a;->G(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_0

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    new-instance p1, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;

    .line 90
    .line 91
    invoke-direct {p1, v1}, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_3
    invoke-virtual {p0}, Lxe/a;->F()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    const/4 v1, 0x4

    .line 102
    if-eq v2, v1, :cond_5

    .line 103
    .line 104
    const/16 v1, 0x20

    .line 105
    .line 106
    if-ne v3, v1, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    new-instance p1, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 110
    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v2, "Invalid server reply: \'"

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {p1, v0}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1

    .line 135
    :cond_5
    new-instance p1, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 136
    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-direct {p1, v0}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_6
    invoke-virtual {p0}, Lxe/a;->F()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_a

    .line 164
    .line 165
    :cond_7
    :goto_1
    if-eqz p1, :cond_8

    .line 166
    .line 167
    iget p1, p0, Lxe/a;->o:I

    .line 168
    .line 169
    invoke-virtual {p0}, Lxe/a;->D()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p0, p1, v0}, Lwe/a;->i(ILjava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    iget p1, p0, Lxe/a;->o:I

    .line 177
    .line 178
    const/16 v0, 0x1a5

    .line 179
    .line 180
    if-eq p1, v0, :cond_9

    .line 181
    .line 182
    return p1

    .line 183
    :cond_9
    new-instance p1, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;

    .line 184
    .line 185
    const-string v0, "FTP response 421 received.  Server closed connection."

    .line 186
    .line 187
    invoke-direct {p1, v0}, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_a
    new-instance p1, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 192
    .line 193
    new-instance v1, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-direct {p1, v0}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p1

    .line 215
    :catch_0
    new-instance p1, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 216
    .line 217
    new-instance v1, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    const-string v2, "Could not parse response code.\nServer Reply: "

    .line 223
    .line 224
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-direct {p1, v0}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p1

    .line 238
    :cond_b
    new-instance p1, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 239
    .line 240
    new-instance v1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string v2, "Truncated server reply: "

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-direct {p1, v0}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw p1

    .line 261
    :cond_c
    new-instance p1, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;

    .line 262
    .line 263
    invoke-direct {p1, v1}, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw p1
.end method

.method public C()I
    .locals 1

    .line 1
    iget v0, p0, Lxe/a;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public D()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lxe/a;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lxe/a;->r:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const/16 v1, 0x100

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    if-ge v4, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v5, "\r\n"

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iput-boolean v3, p0, Lxe/a;->q:Z

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lxe/a;->r:Ljava/lang/String;

    .line 49
    .line 50
    return-object v0
.end method

.method public E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxe/a;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxe/a;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public final G(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-le v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x2d

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Character;->isDigit(C)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v0

    .line 29
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method public H(Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->w:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lxe/a;->P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public I()I
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->x:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxe/a;->O(Lorg/apache/commons/net/ftp/FTPCmd;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public J(Ljava/net/InetAddress;I)I
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/16 v1, 0x2e

    .line 13
    .line 14
    const/16 v2, 0x2c

    .line 15
    .line 16
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    ushr-int/lit8 p1, p2, 0x8

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    and-int/lit16 p1, p2, 0xff

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    sget-object p1, Lorg/apache/commons/net/ftp/FTPCmd;->y:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p0, p1, p2}, Lxe/a;->P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1
.end method

.method public K()I
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->A:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxe/a;->O(Lorg/apache/commons/net/ftp/FTPCmd;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public L(Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->C:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lxe/a;->P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final M(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lxe/a;->x:Ljava/io/BufferedWriter;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lxe/a;->x:Ljava/io/BufferedWriter;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/io/BufferedWriter;->flush()V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p0}, Lwe/a;->n()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;

    .line 20
    .line 21
    const-string v0, "Connection unexpectedly closed."

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lorg/apache/commons/net/ftp/FTPConnectionClosedException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_0
    throw p1
.end method

.method public N(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/a;->x:Ljava/io/BufferedWriter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxe/a;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p0, p2}, Lxe/a;->M(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lwe/a;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lxe/a;->A()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 21
    .line 22
    const-string p2, "Connection is not open"

    .line 23
    .line 24
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public O(Lorg/apache/commons/net/ftp/FTPCmd;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lxe/a;->P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lorg/apache/commons/net/ftp/FTPCmd;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lxe/a;->N(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public Q(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxe/a;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final R(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/16 p2, 0x20

    .line 13
    .line 14
    if-eq p1, p2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 20
    return p1
.end method

.method public S(I)I
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->P:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    const-string v2, "AEILNTCFRPSBC"

    .line 6
    .line 7
    invoke-virtual {v2, p1, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, v0, p1}, Lxe/a;->P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public T(Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->Q:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lxe/a;->P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g()V
    .locals 2

    .line 1
    invoke-super {p0}, Lwe/a;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lxe/a;->w:Ljava/io/BufferedReader;

    .line 6
    .line 7
    iput-object v0, p0, Lxe/a;->x:Ljava/io/BufferedWriter;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lxe/a;->q:Z

    .line 11
    .line 12
    iput-object v0, p0, Lxe/a;->r:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public j()Lorg/apache/commons/net/ProtocolCommandSupport;
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/a;->t:Lorg/apache/commons/net/ProtocolCommandSupport;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lxe/a;->B(Z)I

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->v:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/commons/net/ftp/FTPCmd;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Lxe/a;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lxe/a;->M(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lxe/a;->s()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public u(Ljava/io/Reader;)V
    .locals 3

    .line 1
    invoke-super {p0}, Lwe/a;->b()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    new-instance p1, Lze/a;

    .line 7
    .line 8
    new-instance v0, Ljava/io/InputStreamReader;

    .line 9
    .line 10
    iget-object v1, p0, Lwe/a;->e:Ljava/io/InputStream;

    .line 11
    .line 12
    invoke-virtual {p0}, Lxe/a;->z()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, v0}, Lze/a;-><init>(Ljava/io/Reader;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lxe/a;->w:Ljava/io/BufferedReader;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lze/a;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lze/a;-><init>(Ljava/io/Reader;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lxe/a;->w:Ljava/io/BufferedReader;

    .line 31
    .line 32
    :goto_0
    new-instance p1, Ljava/io/BufferedWriter;

    .line 33
    .line 34
    new-instance v0, Ljava/io/OutputStreamWriter;

    .line 35
    .line 36
    iget-object v1, p0, Lwe/a;->f:Ljava/io/OutputStream;

    .line 37
    .line 38
    invoke-virtual {p0}, Lxe/a;->z()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-direct {v0, v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lxe/a;->x:Ljava/io/BufferedWriter;

    .line 49
    .line 50
    iget p1, p0, Lwe/a;->i:I

    .line 51
    .line 52
    if-lez p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 61
    .line 62
    iget v1, p0, Lwe/a;->i:I

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-virtual {p0}, Lxe/a;->A()I

    .line 68
    .line 69
    .line 70
    iget v0, p0, Lxe/a;->o:I

    .line 71
    .line 72
    invoke-static {v0}, Lxe/c;->c(I)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-virtual {p0}, Lxe/a;->A()I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_3

    .line 84
    :catch_0
    move-exception v0

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    :goto_1
    iget-object v0, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :goto_2
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    .line 93
    .line 94
    const-string v2, "Timed out waiting for initial connect reply"

    .line 95
    .line 96
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    :goto_3
    iget-object v1, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 104
    .line 105
    invoke-virtual {v1, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_2
    invoke-virtual {p0}, Lxe/a;->A()I

    .line 110
    .line 111
    .line 112
    iget p1, p0, Lxe/a;->o:I

    .line 113
    .line 114
    invoke-static {p1}, Lxe/c;->c(I)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    invoke-virtual {p0}, Lxe/a;->A()I

    .line 121
    .line 122
    .line 123
    :cond_3
    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    const/16 p1, 0x20

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string p1, "\r\n"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public w(Ljava/net/InetAddress;I)I
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/16 v2, 0x25

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    const-string v2, "|"

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    instance-of v3, p1, Ljava/net/Inet4Address;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const-string p1, "1"

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of p1, p1, Ljava/net/Inet6Address;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    const-string p1, "2"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    sget-object p1, Lorg/apache/commons/net/ftp/FTPCmd;->j:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p0, p1, p2}, Lxe/a;->P(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1
.end method

.method public x()I
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->k:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxe/a;->O(Lorg/apache/commons/net/ftp/FTPCmd;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public y()I
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->l:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxe/a;->O(Lorg/apache/commons/net/ftp/FTPCmd;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/a;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
