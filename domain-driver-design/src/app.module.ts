import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { UsersModule } from './users/users.module';
import { TypeOrmModule } from '@nestjs/typeorm';
import { OrmConfig } from './ormconfig';

@Module({
  imports: [
    UsersModule,
    TypeOrmModule.forRoot(OrmConfig)
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
